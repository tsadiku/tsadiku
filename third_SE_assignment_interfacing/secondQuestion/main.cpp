#include <stdio.h>
#include <stdlib.h>
#include "Header_demo.h"

int main()
{
 int n1, n2, res;
 n1 = 6;
 n2 = 7;
 res = add(n1, n2);
 printf("the result is %d", res);

 return 0;

}

int add(int a, int b){
    return a + b;
}

int sub(int a, int b){

    return a - b;
}
