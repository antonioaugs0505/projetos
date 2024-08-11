


if(navigator.geolocation){
    navigator.geolocation.getCurrentPosition(function(position){
        document.querySelector('p').innerHTML = "latitute = " + position.coords.latitude + " longitude = " + position.coords.longitude
    })
}