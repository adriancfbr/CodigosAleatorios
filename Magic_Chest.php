<?php
/*
Codigo criado por @AdrianCF
Para https://github.com/adriancfbr/CodigosAleatorios
Obs: Codigo sem utilidade nenhuma

*/
$nivel = $_GET['chaves'];

if ($nivel == null) {
 echo "erro informações invalidas";
 return;
}
if ($nivel <= 0) {
echo "EPA, Você não pode usar este valor";
 return;
}


$Apostar = $nivel*30;
$int = rand(1,$Apostar);
if ($int <= 39)
{
  Chave(1);
  return;
}

if (($int >= 40) && ($int <= 180))
{
  Chave(2);
  return;
}
if (($int >= 181) && ($int <= 280))
{
  Chave(3);
  return;
}
if (($int >= 281) && ($int <= 380))
{
  Chave(4);
  return;
}
if ($int >= 381)
{
  Chave(5);
  return;
}


function Chave($chaves)
{
  $Info = "Nenhuma";

  if ($chaves == 1) {
    $info = "Normal";
    MagicNormal();
   }
  if ($chaves == 2)
    $info = "Especial";
  if ($chaves == 3)
    $info = "Raro";
  if ($chaves == 4)
    $info = "Lendario";
  if ($chaves == 5)
    $info = "Mega Lendario";
 
 
  echo "Nivel do Magic Chest ".$info."</br>";
}


function MagicNormal()
{
  $Premios = rand(1,2);
  $Valor = rand(25,200);
  $MSG = "Você ganhou nada";
  if ($Premios == 1)
  {
    $MSG = "Você ganhou ".$Valor." Coins"; 
  }
  if ($Premios == 2)
  {
   $MSG = "Você ganhou ".$Valor." Cash";
  }

  echo $MSG."</br>";

}

?>
