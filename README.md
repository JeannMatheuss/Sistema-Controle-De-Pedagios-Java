# 🚗💸 Sistema de Controle de Pedágios - Estado de São Paulo

## 📌 Descrição
Projeto Java que simula o controle de veículos em praças de pedágio no Estado de São Paulo.  
Aqui você pode registrar passagens, calcular tarifas e gerar relatórios de arrecadação!

---

## 🧠 **Regras de Negócio**

- Cada **Veículo** possui:
  - Placa
  - Tipo: `Carro`, `Moto`, `Caminhão`
  - Número de eixos (aplicável para caminhão)

- Cada **Praça de Pedágio** possui:
  - Localização
  - Tarifa-base (definida pelo operador)

- 💸 **Cálculo da tarifa:**
  - Carro ➡️ Tarifa-base
  - Moto ➡️ 50% da tarifa-base
  - Caminhão ➡️ Tarifa-base × Número de Eixos

---

## ⚙️ **Funcionalidades**

- ✅ Registrar veículos e suas passagens
- ✅ Calcular valor do pedágio com base no tipo
- ✅ Emitir relatório total de valores arrecadados por praça

---

## 🧪 **Testes Unitários**

- Testes implementados para:
  - 📏 Cálculo do valor do pedágio para todos os tipos de veículos.
  - 🧾 Geração de relatório de arrecadação simulando passagens.

Framework utilizado:
- `JUnit 5` 

---

