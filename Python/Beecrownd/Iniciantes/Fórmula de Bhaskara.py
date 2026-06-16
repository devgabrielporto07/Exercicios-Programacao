a, b, c = map(float, input().split())
delta = ((b**2) - (4*a*c))
if a == 0 or delta < 0:
    print ("Impossivel calcular")
else:
    delta = ((b**2) - (4*a*c))
    Raiz1 = ((-b) + delta**(1/2)) / ((2*a))
    Raiz2 = ((-b) - (delta**(1/2))) / ((2*a))
    print (f"R1 = {Raiz1:.5f}")
    print (f"R2 = {Raiz2:.5f}") 

# and vai incluir as duas por isso que caia no else
# or uma delas satisfaz
# precedência erro
# condicional e definição de variável dentro das condiconais
