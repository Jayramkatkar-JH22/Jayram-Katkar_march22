function check(){
    if (Document.getElementByName("mobileNumbe2")==Document.getElementByName("mobileNumber")) {
        Document.getElementById("res").innertext="Mobile number and alternate no. should not same"
        document.getElementsByClassName("rege").disabled = true; 

    } else {
        document.getElementsByClassName("rege").disabled = false;
    }
}