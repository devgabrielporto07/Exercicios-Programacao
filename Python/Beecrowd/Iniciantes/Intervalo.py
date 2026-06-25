valor_qualquer = float(input())

if valor_qualquer >= 0 and valor_qualquer <= 25.0000:
    print ("Intervalo [0,25]")
elif valor_qualquer >= 25.0001 and valor_qualquer <= 50.0000000:
    print ("Intervalo (25,50]")
elif valor_qualquer >= 50.0000001 and valor_qualquer <= 75.0000:
    print ("Intervalo (50,75]")
elif valor_qualquer >= 75.0001 and valor_qualquer <= 100.0000:
    print ("Intervalo (75,100]")
else:
    print ("Fora de intervalo")