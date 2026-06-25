idade_pessoa_dias = int(input(""))
ano = idade_pessoa_dias // 365 # parte inteira
resto1ano = idade_pessoa_dias % 365 # resto da divisão
mes = resto1ano // 30 
dias = resto1ano % 30
print (f"{ano} ano(s)")
print (f"{mes} mes(es)")
print (f"{dias} dia(s)")