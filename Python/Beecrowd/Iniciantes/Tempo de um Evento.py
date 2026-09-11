
dia_inicial = int(input().split()[1])
tempo_inicial = input().split(" : ")
hora_inicial = int(tempo_inicial[0])
minuto_inicial = int(tempo_inicial[1])
segundo_inicial = int(tempo_inicial[2])

dia_final = int(input().split()[1])
tempo_final = input().split(" : ")
hora_final = int(tempo_final[0])
minuto_final = int(tempo_final[1])
segundo_final = int(tempo_final[2])

# 1. Calcula os segundos
segundos = segundo_final - segundo_inicial
if segundos < 0:
    segundos += 60
    minuto_final -= 1  # Desconta 1 minuto do final antes de calcular os minutos

# 2. Calcula os minutos
minutos = minuto_final - minuto_inicial
if minutos < 0:
    minutos += 60
    hora_final -= 1  # Desconta 1 hora do final antes de calcular as horas

# 3. Calcula as horas e dias
horas = hora_final - hora_inicial
dias = dia_final - dia_inicial
if horas < 0:
    horas += 24
    dias -= 1

print(f"{dias} dia(s)")
print(f"{horas} hora(s)")
print(f"{minutos} minuto(s)")
print(f"{segundos} segundo(s)")
