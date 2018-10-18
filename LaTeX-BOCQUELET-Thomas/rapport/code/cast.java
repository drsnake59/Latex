int i=258;
long l=i; //OK
byte b=i; //ERROR: Explicit cast needed to convert int to byte
byte b=258; //ERROR: Explicit cast needed to convert int to byte
byte b=(byte)i; //OK mais b=2
