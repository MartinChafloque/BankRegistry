import React from "react";
import Card from "react-bootstrap/Card";

const TransferPanel = ({ transfers }) => {
  return (
    <div className="mt-4">
      <h5>Mis Transferencias</h5>
      {transfers.map((transfer, idx) => (
        <Card key={idx} className="mt-3">
          <Card.Body>
            <Card.Title>ID de transferencia: {transfer.id}</Card.Title>
            <Card.Subtitle className="mb-2 text-muted">
              Cuenta enviada: {transfer.accountNumberRec}
            </Card.Subtitle>
            <Card.Text>
              Monto enviado: {transfer.amount} {transfer.currency} <br />
              Fecha de envío: {transfer.date}
            </Card.Text>
          </Card.Body>
        </Card>
      ))}
    </div>
  );
};

export default TransferPanel;
