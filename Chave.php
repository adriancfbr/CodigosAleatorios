<?php

/*
Codigo criado por @AdrianCF
Para https://github.com/adriancfbr/CodigosAleatorios
Obs: Codigo sem utilidade nenhuma

*/

$nivel = $_GET['tamanho'];

if (($nivel == null) || ($nivel <= 0)|| ($nivel >= 20)) {
 echo "EPA, Você não pode usar este valor";
 return;
}

$gerado = Gerar($nivel);


echo "Chave: ".$gerado;


function Gerar($tamanho)
{
  $key = "";

for ($valor = 1; $valor <= $tamanho; $valor++)
{
      if ($key != null)
        $key .= "-";

      $key .= GeradorKey();
} 
return $key;
}


function GeradorKey()
{
      $Caracteres = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      $key = "";
      for ($valor = 0; $valor <= 4; $valor++)
      {
       $val = strlen($Caracteres)-1;
       $key .= $Caracteres[rand(0,$val)];
      }
   return $key;

}


?>
