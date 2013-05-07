function validar(form){
	var nac=false;
	var sex=false;
	var may = "abcdefghijklmnñopqrstuvwxyzáéíóú"
	var num = "0123456789"
	
	if(form.nombre.value==""){
		alert('ingrese el nombre del usuario');
		return false;
	}
	
	if(!(isNaN(parseInt(form.nombre.value)))){
		alert('el nombre tiene numeros');/*true es un numero, false no es un numero*/
		return false;
	}
	for(x=0; x<may.length; x++){
		if(form.nombre.value.charAt(0)==may.charAt(x)){
			alert('la primera letra del nombre debe ser mayuscula');
			return false;
		}
	}
	if(form.apellido.value==""){
		alert('ingrese el apellido del usuario');
		return false;
	}
	if(!(isNaN(parseInt(form.apellido.value)))){
		alert('el apellido tiene numeros');/*true es un numero, false no es un numero*/
		return false;
	}
	for(x=0; x<may.length; x++){
		if(form.apellido.value.charAt(0)==may.charAt(x)){
			alert('la primera letra del apellido debe ser mayuscula');
			return false;
		}
	}
	if(form.cedula.value==""){
		alert('ingrese la cedula del usuario');
		return false;
	}
	
	if (!/^([0-9])*$/.test(form.cedula.value)){
		alert("El valor no es un número");
		return false;
	}
	/*una expresion regular comienza con “/^”  y acaba por "$/." dentro de estos delimitadores coloco el rango [0,9] para validar que sea un numero*/
	/*como se que la ceula puede tener n numeros pongo el operador * aplicado al rango*/
	
	if(form.password.value==""){
		alert(form.nombre.value + ' Ingresa tu password');
		return false;
	}
	if(form.password2.value==""){
		alert('confirme el password');
		return false;
	}
	if(form.nac.value=="Seleccione..."){
		alert('Escoja nacionalidad');
		return false;
	}
	if(form.password.value!=form.password2.value){
		alert('passwords distintos');
		return false;
	}
	for(i=0;i<form.sexo.length;i++){
		if(form.sexo[i].checked!=false){
			nac=true;
			i=form.sexo.length;
		}
	}
	if (nac==false){
		alert('especifique su sexo');
		return false;
	}
	
}
/*function mostrar_usuario(form){
	alert(form.usuario.value);
}*/