lado1, lado2, lado3 = map(float, input().split())
#  A,     B,    C          A = lado1 => maior lado
lista_ladostriangulo = [lado1, lado2, lado3] 

lista_ladostriangulo.sort(reverse=True)
# print (lista_ladostriangulo) 
# print (lista_ladostriangulo [0])

if lista_ladostriangulo [0] >= lista_ladostriangulo [1] + lista_ladostriangulo [2]:
    print ("NAO FORMA TRIANGULO")
elif lista_ladostriangulo [0]**2 == (lista_ladostriangulo [1]**2) + (lista_ladostriangulo [2]**2):
    print ("TRIANGULO RETANGULO")
elif lista_ladostriangulo [0]**2 > (lista_ladostriangulo [1]**2) + (lista_ladostriangulo [2]**2):
    print ("TRIANGULO OBTUSANGULO")
elif lista_ladostriangulo [0]**2 < (lista_ladostriangulo [1]**2) + (lista_ladostriangulo [2]**2):
    print ("TRIANGULO ACUTANGULO")
if lista_ladostriangulo [0] == lista_ladostriangulo [1] and lista_ladostriangulo [0] == lista_ladostriangulo [2]:
    print ("TRIANGULO EQUILATERO")
if lista_ladostriangulo [0] == lista_ladostriangulo [1] and lista_ladostriangulo [1] != lista_ladostriangulo [2] or lista_ladostriangulo [1] == lista_ladostriangulo [2] and lista_ladostriangulo [0] != lista_ladostriangulo [1]:
    print ("TRIANGULO ISOSCELES")
# esse IF foi de fuder