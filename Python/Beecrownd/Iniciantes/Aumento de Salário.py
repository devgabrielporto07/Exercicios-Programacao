salario_funcionario = float(input())
# Fator de aumento (1 + taxa)
# Fator de desconto (1 - taxa)
lista_percentual_reajuste = [1.15, 1.12, 1.10, 1.07, 1.04]
#                              0,    1,    2,    3,    4

if salario_funcionario >= 0 and salario_funcionario <= 400:
    novo_salario = salario_funcionario*(lista_percentual_reajuste[0])
    reajuste_ganho = novo_salario - salario_funcionario
    print (f"Novo salario: {novo_salario:.2f}")
    print (f"Reajuste ganho: {reajuste_ganho:.2f}")
    print ("Em percentual: 15 %")
elif salario_funcionario >= 400.01 and salario_funcionario <= 800:
    novo_salario = salario_funcionario*(lista_percentual_reajuste[1])
    reajuste_ganho = novo_salario - salario_funcionario
    print (f"Novo salario: {novo_salario:.2f}")
    print (f"Reajuste ganho: {reajuste_ganho}")
    print ("Em percentual: 12 %")
elif salario_funcionario >= 800.01 and salario_funcionario <= 1200:
    novo_salario = salario_funcionario*(lista_percentual_reajuste[2])
    reajuste_ganho = novo_salario - salario_funcionario
    print (f"Novo salario: {novo_salario:.2f}")
    print (f"Reajuste ganho: {reajuste_ganho:.2f}")
    print ("Em percentual: 10 %")
elif salario_funcionario >= 1200.01 and salario_funcionario <= 2000:
    novo_salario = salario_funcionario*(lista_percentual_reajuste[3])
    reajuste_ganho = novo_salario - salario_funcionario
    print (f"Novo salario: {novo_salario:.2f}")
    print (f"Reajuste ganho: {reajuste_ganho:.2f}")
    print ("Em percentual: 7 %")
else:
    novo_salario = salario_funcionario*(lista_percentual_reajuste[4])
    reajuste_ganho = novo_salario - salario_funcionario
    print (f"Novo salario: {novo_salario:.2f}")
    print (f"Reajuste ganho: {reajuste_ganho:.2f}")
    print ("Em percentual: 4 %")