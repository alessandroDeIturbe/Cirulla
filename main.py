#!/usr/bin/env python
from colorama import Fore, Back, Style

def error(message):
    return f'{Back.RED}{Fore.WHITE}{message}{Style.RESET_ALL}'


def message(message):
    return f'{Back.BLUE}{Fore.WHITE}{message}{Style.RESET_ALL}'

def get_player_name():
    player = input("Nome del player: ")
    return player

def get_player_num(type, name):
    cards = int(input(f"Inserisci il numero di {type} di {name}: "))
    return cards

def check(player_1_value, player_2_value, type, max, playersPoints):
        
    while not (player_1_value + player_2_value == max):
        print(error(f"Il numero di {type} non è uguale a {max}, riconteggiate le carte"))
        player_1_value = get_player_num(type, playersPoints[0])
        player_2_value = get_player_num(type, playersPoints[1])

    if player_1_value > player_2_value:
        return 0
    elif player_1_value < player_2_value:
        return 1
    elif player_1_value == player_2_value:
        return 2



player_1_points = 0
player_2_points = 0
untaken = 0

print("Benvenuti nel calcolatore di punti per Cirulla! Inserire i nomi dei due giocatori.")

player1 = get_player_name().upper()
player2 = get_player_name().upper()

# CARTE

player_1_carte = get_player_num("carte", player1)
player_2_carte = get_player_num("carte", player2)

point = check(player_1_carte, player_2_carte, "carte", 40, [player1, player2, untaken])
if point == 0:
    player_1_points += 1
elif point == 1:
    player_2_points += 1
elif point == 2:
    untaken += 1

print(f"\nPunti di {player1}: {player_1_points}, Punti di {player2}: {player_2_points}\n")

# DENARI

player_1_denari = get_player_num("denari", player1)
player_2_denari = get_player_num("denari", player2)

point = check(player_1_denari, player_2_denari, "denari", 10, [player1, player2, untaken])
if point == 0:
    player_1_points += 1
elif point == 1:
    player_2_points += 1
elif point == 2:
    untaken += 1

print(f"\nPunti di {player1}: {player_1_points}, Punti di {player2}: {player_2_points}\n")

# PRIMIERA

player_1_seven = get_player_num("sette", player1)
player_2_seven = get_player_num("sette", player2)

point = check(player_1_seven, player_2_seven, "sette", 4, [player1, player2, untaken])
if point == 0:
    player_1_points += 1
elif point == 1:
    player_2_points += 1
elif point == 2:

    player_1_six = get_player_num("sei", player1)
    player_2_six = get_player_num("sei", player2)

    point = check(player_1_six, player_2_six, "sei", 4, [player1, player2, untaken])
    if point == 0:
        player_1_points += 1
    elif point == 1:
        player_2_points += 1
    elif point == 2:

        A_cuori = int(input(f"Chi ha l'asso di cuori? (1:{player1}, 2:{player2}) "))

        while True:
            if A_cuori == 1:
                player_1_points += 1
                break
            elif A_cuori == 2:
                player_2_points += 1
                break

print(f"\nPunti di {player1}: {player_1_points}, Punti di {player2}: {player_2_points}\n")

# RE BELLO

K_denari = int(input(f"Chi ha il re bello? (1:{player1}, 2:{player2}) "))
while True:
    if K_denari == 1:
        player_1_points += 1
        break
    elif K_denari == 2:
        player_2_points += 1
        break

print(f"\nPunti di {player1}: {player_1_points}, Punti di {player2}: {player_2_points}\n")

# SETTE BELLO

seven_denari = int(input(f"Chi ha il sette bello? (1:{player1}, 2:{player2}) "))
while True:
    if seven_denari == 1:
        player_1_points += 1
        break
    elif seven_denari == 2:
        player_2_points += 1
        break
          
print(f"\nPunti di {player1}: {player_1_points}, Punti di {player2}: {player_2_points}\n")
        
# SCOPE

player_1_scope = int(input(f"Numero di scope di {player1}: "))
player_2_scope = int(input(f"Numero di scope di {player2}: "))

player_1_points += player_1_scope
player_2_points += player_2_scope

print(f"\nPunti di {player1}: {player_1_points}, Punti di {player2}: {player_2_points}\n")

# 