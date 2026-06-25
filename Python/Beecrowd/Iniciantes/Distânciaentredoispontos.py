x1, y1 = map(float, input("Digite o valor de x1 e y1: ").split())
x2, y2 = map(float, input("Digite o valor de x2 e y2: ").split())

distancia = ((x2 - x1)**2 + (y2 - y1)**2)**(1/2)

print (f"A distância entre os dois pontos é {distancia:.4f}")

# (map) ele serve para transformar as palavras que você digita (que o Python recebe como texto/string) em números decimais (float) de uma só vez.