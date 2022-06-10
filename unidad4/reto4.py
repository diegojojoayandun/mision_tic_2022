#!/usr/bin/python3
from functools import reduce


def ordenes(rutinaContable):
    """
    bitácora acerca de los registros diarios de una papelería
    calcula el total de la suma de las facturas del dia, con incremento
    de 25000 si el total de la compra es menor a 600000
    """
    dict_ordenes = {}

    for orden in rutinaContable:
        result = tuple(filter(lambda element: type(element) == tuple, orden))
        ls_total = list(map(lambda element: element[1] * element[2], result))
        totales = reduce(lambda sum_tot, element: sum_tot + element, ls_total)

        if totales < 600000:
            totales += 25000
        dict_ordenes[orden[0]] = totales

    print('----------------- Inicio Registro diario --------------------------')
    for k, v in dict_ordenes.items():
        print('La factura {} tiene un total en pesos de {:,.2f}'.format(k, v))
    print('----------------- Fin Registro diario -----------------------------')


ordenes([[1201, ("5464", 4, 25842.99), ("7854", 18, 23254.99), ("8521", 9, 48951.95)],
         [1202, ("8756", 3, 115362.58), ("1112", 18, 2354.99)],
         [1203, ("2547", 1, 125698.20), ("2635", 2, 135645.20), ("1254", 1, 13645.20), ("9965", 5, 1645.20)],
         [1204, ("9635", 7, 11.99), ("7733", 11, 18.99), ("88112", 5, 390.95)]])
