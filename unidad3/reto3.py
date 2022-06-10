#!/usr/bin/python3
def AutoPartes(ventas:list):
    """agrega ventas en el registro de autopartes"""
    venta = {}
    for idProducto,dProdcuto, pnProducto, cvProducto, sProducto, nComprador, cComprador, fVenta in ventas:
        if venta.get(idProducto) == None:
            venta[idProducto] = []
        venta[idProducto].append((dProdcuto, pnProducto, cvProducto, sProducto, nComprador, cComprador, fVenta))
    return venta

def consultaRegistro(ventas, idProducto):
    """Consulta informacion acerca de un determinado prodcuto"""
    if idProducto in ventas:
        for dProdcuto, pnProducto, cvProducto, sProducto, nComprador, cComprador, fVenta in ventas[idProducto]:
            print('Producto consultado : {}  Descripción  {}  #Parte  {}  Cantidad vendida  {}  Stock  {}  Comprador {}  Documento  {}  Fecha Venta  {}'.
            format(idProducto, dProdcuto, pnProducto, cvProducto,sProducto, nComprador, cComprador, fVenta))
    else:
        print('No hay Registro de venta de ese producto')

consultaRegistro(AutoPartes([
    (2001,'rosca', 'PT29872',2,45,'Luis Molero',3456,'12/06/2020'),
    (2010,'bujía', 'MS9512',4,15,'Carlos Rondon',1256,'12/06/2020'),
    (2010,'bujía', 'ER6523',9,36,'Pedro Montes',1243,'12/06/2020'),
    (3578,'tijera', 'QW8523',1,128,'Pedro Faria',1456,'12/06/2020'),
    (9251,'piñón', 'EN5698',2,8,'Juan Peña',565,'12/06/2020')]), 2010)