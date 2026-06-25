salario_lisarb = float(input())
# Revisar esse*
if salario_lisarb <= 2000.00:
    print("Isento")

elif salario_lisarb <= 3000.00:
    imposto = (salario_lisarb - 2000) * 0.08
    print(f"R$ {imposto:.2f}")

elif salario_lisarb <= 4500.00:
    imposto = (1000 * 0.08) + ((salario_lisarb - 3000) * 0.18)
    print(f"R$ {imposto:.2f}")

else:
    imposto = (
        (1000 * 0.08) +
        (1500 * 0.18) +
        ((salario_lisarb - 4500) * 0.28)
    )
    print(f"R$ {imposto:.2f}")

"""Faixa 0 a 2000 → isento
Faixa 2000.01 a 3000 → 1000 × 8% = 80
Faixa 3000.01 a 4500 → 1500 × 18% = 270
Faixa acima de 4500 → 20 × 28% = 5.60"""