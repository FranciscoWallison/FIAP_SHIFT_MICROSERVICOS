package padroesgof.pagamento;

class PagamentoComDinheiro extends Pagamento {

     private final int limiteValor = 0;

    PagamentoComDinheiro(long contador, int valor) {
        this.id = contador;
        this.setValorPagamento(valor);
        processarPagamento(valor);
    }

    @Override
    public PagamentoComDinheiro processarPagamento(int valor) {
        
         if (valor >= limiteValor) {
            this.setStatusPagamento("Pagamento em Dinheiro processado com sucesso");
        }
        else {
            this.setStatusPagamento("Pagamento não autorizado");
        }
        return this;
        
    }
}