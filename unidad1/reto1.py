#!/usr/bin/env python3


def CDT(usuario, capital, tiempo):
    """Calcula los intereses a un termino de tiempo y capital para
    un usuario definidos por parametro
    parametros: usuario, capital, tiempo
    salida: string total
    """

    total = 0

    if tiempo <= 2:
        total = int(capital - (capital * 0.02))
    else:
        total = int(capital + ((capital * 0.03 * tiempo) / 12))

    return "Para el usuario {:s} La cantidad de dinero a recibir, según el monto inicial {:d} para un tiempo de {:d} meses es: {:.1f}".format(
        usuario, capital, tiempo, total
    )


print(CDT("AB1012", 1000000, 3))
print(CDT("ER3366", 650000, 2))
