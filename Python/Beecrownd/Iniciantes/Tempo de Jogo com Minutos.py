hora_inicial, minuto_inicial, hora_final, minuto_final = map(int, input().split())
# Obs => o jogo tem duração mínima de um 1 minuto e maxima de 24 horas
# (1 minutos, 1440 minutos) Intervalo fechado

conversao_minuto_hora_inicial = hora_inicial*60
conversao_minuto_hora_final = hora_final*60
total_minutos_inicial = conversao_minuto_hora_inicial + minuto_inicial
total_minutos_final = conversao_minuto_hora_final + minuto_final
# total_minutos_tudo = total_minutos_inicial + total_minutos_final
# Horarios iguais 24 horas a duração
if hora_inicial == hora_final and minuto_inicial == minuto_final:
    print ("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)")
else:
    if total_minutos_inicial < total_minutos_final: # Não passa da meia noite
        diferenca_minutos = total_minutos_final - total_minutos_inicial
        horas = diferenca_minutos // 60
        minutos = diferenca_minutos % 60
        print (f"O JOGO DUROU {horas} HORA(S) E {minutos} MINUTO(S)")
    else: # Passa da meia noite
        passou_da_meia_noite_ne_bb1 = (1440 - total_minutos_inicial) + total_minutos_final
        horas = passou_da_meia_noite_ne_bb1 // 60
        minutos = passou_da_meia_noite_ne_bb1 % 60
        print (f"O JOGO DUROU {horas} HORA(S) E {minutos} MINUTO(S)")
