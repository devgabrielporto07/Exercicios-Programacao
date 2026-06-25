v1, v2, v3 = map(int, input().split())

maior_v1v2 = (v1 + v2 + abs(v1-v2)) / 2
maiorv3 = (maior_v1v2 + v3 + abs(maior_v1v2 - v3)) / 2


print (f"{maiorv3:.0f} eh o maior")