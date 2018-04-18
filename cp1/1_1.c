#include <stdio.h>
#include <stdbool.h>

bool check(char x[]){
  int size = sizeof(x)/sizeof(x[0]);
  for(int i=0; i<size; i++){
    for(int j=i+1; j<size; j++){
      if(x[i] == x[j]){
	return false;
      }
    }
  }
  return true;
}

int main(){
  char x[] = "abcdd";
  if(!(check(x))){
    printf("String does not have all unique characters");
  }else{
    printf("String has all unique characters");
  }
}
