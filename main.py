#!/usr/bin/env python
from colorama import Fore, Back, Style
import json
import os


def error(message):
    return f'{Back.RED}{Fore.WHITE}{message}{Style.RESET_ALL}'


def message(message):
    return f'{Back.BLUE}{Fore.WHITE}{message}{Style.RESET_ALL}'

# ! def update_data(old_data, new_data):
# !     updated_data = {}
# !     for key in new_data:
# !         if key in old_data:
# !             updated_data[key] = {"name": old_data[key]["name"], "points": old_data[key]["points"] + new_data[key]["points"]}
# !         else:
# !             updated_data[key] = new_data[key]
# !     return updated_data


def update_points(old_data: dict, new_data: dict):
    for player in new_data:
        if player in old_data:
            old_data[player]["points"] += new_data[player]["points"]
        else:
            old_data[player] = new_data[player]
    return old_data


class Player:
    def __init__(self, player_num: int):
        self.player_num = player_num
        self.name = self.get_player_name()
        self.points = 0
        self.value = None

    def get_player_name(self):
        return input(f"Nome del {self.player_num}° giocatore: ")


player1 = Player(1)
player2 = Player(2)

current_data = {
    player1.name.upper(): {
        "name": player1.name,
        "points": player1.points
    },
    player2.name.upper(): {
        "name": player2.name,
        "points": player2.points
    }
}

if os.path.exists("./data.json"):
    with open("data.json", "r") as f:
        old_data = json.load(f)
        data = update_points(old_data=old_data, new_data=current_data)
    with open("data.json", "w") as f:
        f.write(json.dumps(data))
else:
    with open("data.json", "w") as f:
        f.write(json.dumps(current_data))
