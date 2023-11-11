import React, {useState } from "react";
import classNames from "classnames";
import { Line, Bar } from "react-chartjs-2";
import { Button, ButtonGroup, Card, CardHeader, CardBody, CardTitle, DropdownToggle, DropdownMenu, DropdownItem, UncontrolledDropdown, Label, FormGroup, Input, Table, Row, Col, UncontrolledTooltip, } from "reactstrap";

function Login() {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');

  const handleLogin = () => {
    // Verifica las credenciales (puedes ajustar esta lógica)
    if (username === 'usuario' && password === 'contraseña') {
      alert('Inicio de sesión exitoso');
    } else {
      alert('Credenciales incorrectas. Inténtalo de nuevo.');
    }
  };

  return (
    <div className="login-container">
      <h2>Login</h2>
      <label htmlFor="username">Usuario:</label>
      <input
        type="text"
        id="username"
        name="username"
        value={username}
        onChange={(e) => setUsername(e.target.value)}
        required
      />

      <label htmlFor="password">Contraseña:</label>
      <input
        type="password"
        id="password"
        name="password"
        value={password}
        onChange={(e) => setPassword(e.target.value)}
        required
      />

      <button type="button" onClick={handleLogin}>
        Iniciar sesión
      </button>
    </div>
  );
}

export default Login;
