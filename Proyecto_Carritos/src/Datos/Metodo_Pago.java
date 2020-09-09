/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package Datos;

/**
 * @author GIOVANI DAVID MEZA POGGIO CARNÉ 5990-18-14676
 * @author Wendy Pricila Cifuentes Lutin CARNÉ 5990-18-4413
 */
public abstract class Metodo_Pago {
    private int opcionPago,cuota3,cuota6,cuota12,total,subtotal; 
    
    public Metodo_Pago(){
    this.total = 0;
    this.subtotal = 0;
    this.opcionPago = 0;
    this.cuota3 = 0;
    this.cuota6 = 0;
    this.cuota12 = 0;
    }
    
    public abstract void menuPago(double total);
}
