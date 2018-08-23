valorInc = int(input('Digite um número inicial: '))
valorFin = int(input('Digite um número final: '))
numeroPrimo = []


for x in range(valorInc, valorFin + 1):
    cont =0

    for y in range(1, x + 1):
        if x % y == 0:
            cont += 1

    if cont<=2:
        numeroPrimo.append(x)

print('Número de entrada: {}, {} '.format(valorInc, valorFin))
print('Saída: ', numeroPrimo)






