Lab 10 AspectJ feature.

 Comparison :

 For lab1, the problem of the different models of gumball machine was handled using inheritance. With each subclass representing the each model. However, in order to test any one of the model, all the Gumball models were required to be instantiated with appropriate cost and accepted denominations. Also, there was little flexibility left with choosing between the models to test , which always included writing more test code in main with appropriate denominations and cost.

 However, in feature aspectJ, the selection of feature was quite simple using featuremodel.xml . This approach allowed to test the all the combinations without changing any code. This feature is very interesting as at run time - feature model shows valid/invalid combination of features. Also , using aspectJ - we can efficently separate out the models based on features ( crank model / slot model) - which is difficult to obtain otherwise ( crank/slot stays within gumball scope)


![Alt text](https://github.com/priyakhadke15/cmpe202/blob/master/lab10/output/GumballV2_CrankMachine%2025%20Cents.JPG?raw=true "Optional Title")

![Alt text](https://github.com/priyakhadke15/cmpe202/blob/master/lab10/output/GumballV2_CrankMachine%2050%20Cents.JPG?raw=true "Optional Title")

![Alt text](https://github.com/priyakhadke15/cmpe202/blob/master/lab10/output/GumballV2_SlotMachine%2025%20Cents.JPG?raw=true "Optional Title")

![Alt text](https://github.com/priyakhadke15/cmpe202/blob/master/lab10/output/GumballV2_SlotMachine%2050%20Cents.JPG?raw=true "Optional Title")
