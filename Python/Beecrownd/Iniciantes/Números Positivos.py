contador1 = 0
for number in range (6):
    numero_user1 = float(input())
    if numero_user1 > 0:
        contador1 += 1
print (f"{contador1} valores positivos")

contador2 = 0
repeticoes = 0
while repeticoes < 6:
    numero_user2 = float(input())
    if numero_user2 > 0:
        contador2 += 1
    repeticoes += 1
print (contador2)