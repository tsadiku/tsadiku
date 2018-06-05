<html>
<head>
<title>custom news website</title>
<style>

body{
    width: 60%;
    margin: auto;
    margin-top: 100px;
}

#titlecontent{
    margin: auto;
    width: 80%;
    background: #ccc;
    margin-bottom: 20px;
    padding:10px;

}

#title{
    text-align:center;
    margin: auto;
    width: 60%;
    background: #ddd;
    margin-bottom: 20px;
    padding:10px;

}

#content{
    text-align:center;
    margin: auto;
    width: 80%;
    background: #eee;
    margin-bottom: 20px;
    padding:10px;

}
img{
    float: right;
}

</style>
</head>
<body>
<?php
if (isset($_POST["submit"])){
    $bbctitle = $_POST["bbctitle"];
    $bbccontent = $_POST["bbccontent"];  
    $bbcimage = $_POST["bbcimage"];  
}
?>

<div id="titlecontent">
<div id="title">
<?php
echo $bbctitle;
?>
</div>
<div id="contentimage">
<div id="content">
<?php
echo $bbccontent;
?>
</div>
<img src=$bbcimage alt="bbc image" width="80%"/>
</div>
</div>

</body>
</html>