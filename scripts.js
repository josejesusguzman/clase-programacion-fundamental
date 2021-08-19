function mostrarMensaje() {
    alert("Me has dado clic");

    if (document.getElementById("logo_barca").style.display == "none") {
        document.getElementById("logo_barca").style.display = "block";
    } else {
        document.getElementById("logo_barca").style.display = "none";
    }
}