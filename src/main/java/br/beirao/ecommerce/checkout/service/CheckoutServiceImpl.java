package br.beirao.ecommerce.checkout.service;

import br.beirao.ecommerce.checkout.entity.CheckoutEntity;
import br.beirao.ecommerce.checkout.repository.CheckoutRepository;
import br.beirao.ecommerce.checkout.resource.CheckoutRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public record CheckoutServiceImpl(
    CheckoutRepository checkoutRepository
) implements ICheckoutService {
  @Override
  public Optional<CheckoutEntity> create(CheckoutRequest CheckoutRequest) {
    return Optional.empty();
  }
}
