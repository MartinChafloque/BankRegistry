import React from "react";
import Card from "react-bootstrap/Card";

const Account = ({ account }) => {
  return (
    <div>
      <h5>Mi cuenta</h5>
      <Card className="text-center" bg="secondary" text="white">
        <Card.Header>
          <Card.Title> Número de Cuenta #{account.accountNumber}</Card.Title>
        </Card.Header>
        <Card.Body>
          <Card.Text>
            Nombre del Titular: {account.firstName} {account.lastName}
          </Card.Text>
          <Card.Text>Fecha de Nacimiento: {account.dob}</Card.Text>
          <Card.Text>Tipo de Cuenta: {account.type}</Card.Text>
          <Card.Text>
            Total: ${account.amount} {account.currency}
          </Card.Text>
        </Card.Body>
        <Card.Footer>Cuenta creada en: {account.createdAt}</Card.Footer>
      </Card>
    </div>
  );
};

export default Account;
