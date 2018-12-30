#include <stdio.h>

int main(int argc, char *argv[]){

for(int i = 0; i < argc; i++){
printf("The argument: %s\n", argv[i]);
}
printf("Number of arguments is: %d\n", argc);
return 0;
}
