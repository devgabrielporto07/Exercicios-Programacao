soma_media_valores_positivos = 0 # no começo não temos nada pense nisso
valores = 0 
# acumular os valores variável acumuladora
# usou a variavel valores duplicado por isso ta indo errado
for valores_positivos in range(6):
    valores_usuarios = float(input())
    if valores_usuarios > 0: # valores positivos
        valores += 1
        soma_media_valores_positivos += valores_usuarios
        # soma_media_valores_positivos /= valores (error) 3.925 ta atribuindo dentro do loop
        # 7 + 6 / 2 = 6.5 ai agora 6.5 + 4.6 = 11.1 / 3 = 3.7 3.7 + 12 = 15.7/4 => 3.925 
soma_media_valores_positivos /= valores
print (f"{valores} valores positivos")
print (f"{soma_media_valores_positivos:.1f}")