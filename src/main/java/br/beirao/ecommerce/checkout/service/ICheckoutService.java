package br.beirao.ecommerce.checkout.service;

import br.beirao.ecommerce.checkout.entity.CheckoutEntity;
import br.beirao.ecommerce.checkout.resource.CheckoutRequest;
import org.springframework.boot.web.embedded.jetty.ConfigurableJettyWebServerFactory;

import java.util.Optional;

public interface ICheckoutService {
  Optional<CheckoutEntity> create(CheckoutRequest CheckoutRequest);

}
