hora_inicio_game, hora_final_game = map(int, input().split())

if hora_final_game > hora_inicio_game:
    duracao_jogo = hora_final_game - hora_inicio_game
    print (f"O JOGO DUROU {duracao_jogo} HORA(S)")
elif hora_final_game < hora_inicio_game:
    duracao_jogo = (24 - hora_inicio_game) + hora_final_game
    print (f"O JOGO DUROU {duracao_jogo} HORA(S)")
else:
    print ("O JOGO DUROU 24 HORA(S)")