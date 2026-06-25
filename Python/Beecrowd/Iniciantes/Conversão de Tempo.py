"""tempo_duração_segundos = int(input(""))
# horas:minutos:segundos
segundos = tempo_duração_segundos % 60
minutos = tempo_duração_segundos // 60
horas = minutos // 60
print (horas,minutos,segundos)

# 556 / 60 => 9.26666666667
# 556 - 540(60*9) => (16) %
# 556 // 60 => 9"""

tempo_duracao_segundos = int(input())

horas = tempo_duracao_segundos // 3600
resto = tempo_duracao_segundos % 3600

minutos = resto // 60
segundos = resto % 60

print(f"{horas}:{minutos}:{segundos}")