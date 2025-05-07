function addUtang() {
    const name = document.getElementById("name").value.trim();
    const utang = document.getElementById("utang").value.trim();

    if (name === "" || utang === "") {
      alert("Pakilagay ang parehong pangalan at halaga ng utang.");
      return;
    }

    const ul = document.getElementById("nakautangs");
    const li = document.createElement("li");
    li.textContent = `${name} - ₱${parseFloat(utang).toFixed(2)}`;
    ul.appendChild(li);

    // Clear inputs
    document.getElementById("name").value = "";
    document.getElementById("utang").value = "";
  }