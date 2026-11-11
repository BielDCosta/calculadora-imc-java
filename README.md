# Calculadora de IMC

Programa em Java que calcula o Índice de Massa Corporal (IMC) e mostra a classificação da OMS.

## Como rodar

Precisa do Java 11 ou superior.

```bash
javac CalculadoraIMC.java
java CalculadoraIMC
```

Exemplo:

```
Peso (kg): 70
Altura (m): 1,75

Seu IMC é 22,86 (Peso normal).
```

## Classificação

| IMC            | Classificação      |
|----------------|--------------------|
| menor que 18,5 | Abaixo do peso     |
| 18,5 a 24,9    | Peso normal        |
| 25,0 a 29,9    | Sobrepeso          |
| 30,0 a 34,9    | Obesidade grau I   |
| 35,0 a 39,9    | Obesidade grau II  |
| 40,0 ou mais   | Obesidade grau III |

Fórmula: `IMC = peso / altura²`
