// JavaScript Document
function show(str)
{
	var str="show"+str;
	document.getElementById("show1").style.display="none";
	document.getElementById("show2").style.display="none";
	document.getElementById("show3").style.display="none";
	document.getElementById(str).style.display="block";
}