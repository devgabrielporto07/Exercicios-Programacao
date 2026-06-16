lado1, lado2, lado3 = map(float, input().split())
perimetro = lado1 + lado2 + lado3
area_trapezio = ((lado1 + lado2)*lado3) / (2)
if lado1 >= lado2 and lado1 >= lado3 and lado1 < lado2 + lado3:
    print (f"Perimetro = {perimetro:.1f}")
elif lado2 >= lado1 and lado2 >= lado3 and lado2 < lado1 + lado3:
    print (f"Perimetro = {perimetro:.1f}")
elif lado3 >= lado2 and lado3 >= lado1 and lado3 < lado2 + lado1:
    print (f"Perimetro = {perimetro:.1f}")
else:
    print (f"Area = {area_trapezio:.1f}")