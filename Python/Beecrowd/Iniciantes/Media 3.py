nota1, nota2, nota3, nota4 = map (float, input().split())
# nota_exame = float(input()) Error
media = ((nota1*2) + (nota2*3) + (nota3*4) + (nota4*1)) / (10)

if media >= 7:
    print (f"Media: {media:.1f}")
    print ("Aluno aprovado.")
elif media < 5:
    print (f"Media: {media:.1f}")
    print ("Aluno reprovado.")
else:
    print (f"Media: {media:.1f}")
    print ("Aluno em exame.")
    # nota_exame = float(input("Nota do exame: ")) Error
    nota_exame = float(input())
    print (f"Nota do exame: {nota_exame:.1f}")
    media_final = (nota_exame + media) / (2)
    if media_final >= 5.0:
        print ("Aluno aprovado.")
        print (f"Media final: {media_final}")
    else:
        print ("Aluno reprovado.")
        print (f"Media final: {media_final}")