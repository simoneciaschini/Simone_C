#include <sys/wait.h>
#include <stdio.h>
#include <stdlib.h>
int main(){
	int pid, status;
	pid = fork();
	if(pid == 0){                  //ramo eseguito dal solo processo figlio
	printf("codice eseguito dal figlio \n");
	printf("codice eseguito dal figlio \n");
	exit(0);
	}               
	else{                         //ramo eseguito dal solo processo padre
	pid = wait(&status);         // attesa terminazione
	printf("terminato processo figlio n.%\n", pid);
	if((char)status == 0)       // controllo terminazione figlio
	printf("terminazione volontaria con stato %d\n", status);
	else
	printf("terminazione errata con segnale %\n", (char) status);
	 }
	}
	
	







