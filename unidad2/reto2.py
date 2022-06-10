#!/usr/bin/python3


def cliente(informacion:dict)-> dict:


    primer_ingreso = informacion['primer_ingreso']
    nombre = informacion['nombre']
    edad = informacion['edad']
    total = 0

    if edad > 18:
        atraccion = 'X-Treme'
        apto = True
        if primer_ingreso == True:
            total = 20000 - (20000 * 0.05)
        else:
            total = 20000

    elif edad >= 15 and edad <= 18:
        atraccion = 'Carros chocones'
        apto = True
        if primer_ingreso == True:
            total = 5000 - (5000 * 0.07)
        else:
            total = 5000

    elif edad >= 7 and edad < 15:
        atraccion = 'Sillas voladoras'
        apto = True
        if primer_ingreso == True:
            total = 10000 - (10000 * 0.05)
        else:
            total = 10000
    else:
        atraccion = 'N/A'
        apto = False
        total = 'N/A'

    return {
            'nombre': nombre,
            'edad': edad,
            'atraccion': atraccion,
            'apto': apto,
            'primer_ingreso': primer_ingreso,
            'total_boleta': total
            }

print(cliente({'id': 1, 'nombre':'Johana Fernandez', 'edad': 20, 'primer_ingreso': True}))
print(cliente({'id': 1, 'nombre':'Johana Fernandez', 'edad': 20, 'primer_ingreso': False}))
print(cliente({'id': 2, 'nombre':'Gloria Suarez', 'edad': 3, 'primer_ingreso': True}))
print(cliente({'id': 3, 'nombre': 'Tatiana Suarez', 'edad': 17, 'primer_ingreso': True}))
print(cliente({'id': 3, 'nombre': 'Tatiana Suarez', 'edad': 17, 'primer_ingreso': False}))
print(cliente({'id': 4, 'nombre': 'Tatiana Ruiz', 'edad': 8, 'primer_ingreso': True}))
print(cliente({'id': 4, 'nombre': 'Tatiana Ruiz', 'edad': 8, 'primer_ingreso': False}))
