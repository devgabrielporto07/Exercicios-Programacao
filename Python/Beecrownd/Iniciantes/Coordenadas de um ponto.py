valorx, valory = map(float, input().split())

if valorx > 0 and valory > 0:
    print ("Q1")
elif valorx < 0 and valory > 0:
    print ("Q2")
elif valorx < 0 and valory < 0:
    print ("Q3")
elif valorx > 0 and valory < 0:
    print ("Q4")
elif valorx != 0 and valory == 0:
    print ("Eixo X")
elif valorx == 0 and valory != 0:
    print ("Eixo Y")
else:
    print ("Origem")
# De prima pae accepted chama