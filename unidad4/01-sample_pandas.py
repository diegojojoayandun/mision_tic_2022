#!/usr/bin/python3
"""Sample pandas dataset, dataframe"""

import pandas as pd
entradas = pd.Series([11, 18, 12, 16, 9, 16, 22, 28, 31, 29, 30, 12],
                     index=["ene", "feb", "mar", "abr", "may", "jun",
                            "jul", "ago", "sep", "oct", "nov", "dic"])

salidas = pd.Series([9, 26, 18, 15, 6, 22, 19, 25, 34, 22, 21, 14],
                    index=["ene", "feb", "mar", "abr", "may", "jun",
                           "jul", "ago", "sep", "oct", "nov", "dic"])

almacen = pd.DataFrame({"entradas": entradas, "salidas": salidas})
almacen["neto"] = almacen.entradas - almacen.salidas
print(almacen.describe())
