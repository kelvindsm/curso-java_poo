package TratamentoExcecoes.ProblemaExemplo.exceptions;

import java.io.Serial;

public class DomainException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;
    //serializable: classes serializable podem ter seus objetos convertidos para bytes, e assim, trafegar em redes (?)

    public DomainException (String msg) {
        super(msg);
    }
}
