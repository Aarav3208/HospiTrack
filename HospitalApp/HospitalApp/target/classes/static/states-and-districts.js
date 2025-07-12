document.addEventListener("DOMContentLoaded", function () {
    const stateSelect = document.getElementById('state');
    const districtSelect = document.getElementById('district');

    fetch('/js/states-and-districts.json')
        .then(response => response.json())
        .then(data => {
            data.states.forEach(stateObj => {
                const option = document.createElement('option');
                option.value = stateObj.state;
                option.textContent = stateObj.state;
                stateSelect.appendChild(option);
            });

            stateSelect.addEventListener('change', function () {
                const selectedState = stateSelect.value;
                const state = data.states.find(s => s.state === selectedState);

                districtSelect.innerHTML = '<option value="">-- Select District --</option>';

                if (state) {
                    state.districts.forEach(district => {
                        const option = document.createElement('option');
                        option.value = district;
                        option.textContent = district;
                        districtSelect.appendChild(option);
                    });
                }
            });
        })
        .catch(error => console.error("Error loading states JSON:", error));
});
