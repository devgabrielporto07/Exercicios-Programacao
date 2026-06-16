codigo_item, quantidade_item = map(float, input().split())

# list = [codigo_item, quantidade_item]
lista_valores = [4.00, 4.50, 5.00, 2.00, 1.50]

if codigo_item == 1:
    codigo_item = quantidade_item*lista_valores[0]
    print (f"Total: R$ {codigo_item:.2f}")
elif codigo_item == 2:
    codigo_item = quantidade_item*lista_valores[1]
    print (f"Total: R$ {codigo_item:.2f}")
elif codigo_item == 3:
    codigo_item = quantidade_item*lista_valores[2]
    print (f"Total: R$ {codigo_item:.2f}")
elif codigo_item == 4:
    codigo_item = quantidade_item*lista_valores[3]
    print (f"Total: R$ {codigo_item:.2f}")
elif codigo_item == 5:
    codigo_item = quantidade_item*lista_valores [4]
    print (f"Total: R$ {codigo_item:.2f}")