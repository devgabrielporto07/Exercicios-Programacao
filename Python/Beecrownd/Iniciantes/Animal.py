grupovertorinvert = str(input("")).lower()
classeanimais = str(input("")).lower()
fontealimentacao = str(input("")).lower()

if grupovertorinvert == "vertebrado":
    if classeanimais == "ave":
        if fontealimentacao == "carnivoro":
            print ("aguia")
        else:
            print ("pomba")
if grupovertorinvert == "vertebrado":
    if classeanimais == "mamifero":
        if fontealimentacao == "onivoro":
            print ("homem")
        else:
            print ("vaca")
if grupovertorinvert == "invertebrado":
    if classeanimais == "inseto":
        if fontealimentacao == "hematofago":
            print ("pulga")
        else:
            print ("lagarta")
if grupovertorinvert == "invertebrado":
    if classeanimais == "anelideo":
        if fontealimentacao == "hematofago":
            print ("sanguessuga")
        else:
            print ("minhoca")