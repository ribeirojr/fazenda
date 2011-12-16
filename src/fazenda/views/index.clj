(ns fazenda.views.index
  (:require [fazenda.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/" []
  (common/layout
   [:H1 "- A fazenda do LW facts -"]
   [:p "A fazenda do LW é tão grande que quando esvaziam a piscina é época de cheia no Pantanal."]
   [:p "O objetivo principal da transposição do Rio São Francisco é abastecer de água a fazenda do LW. Detalhe. Só a casa do caseiro."]
   [:p "Falando em caseiro, uma vez o filho dele perdeu-se na fazenda. Foi parar em El-Salvador."]
   [:p "Uns amigos do avô do LW fizeram uma expedição pra atravessar a fazenda. O guia da expedição era o Amir Klink."]
   [:p "Foi nesta expedição que encontraram no lago da fazenda três submarinos da segunda guerra. Os soldados estavam vivos e nem sabiam que a guerra havia acabado."]
   [:p "Teve um churrasco na fazenda do LW. Era tanta carne que duas espécies de boi entraram em extinção. E quando ligaram as luzes teve blecaute no planalto central."]
   [:p "A fazenda é tão grande que tem duas dimensões paralelas. E lá foi filmado LOST."]
   [:p "Certa vez, a fazenda do LW foi invadida por sem-terra. Eram pigmeus africanos."]
   [:p "A fazenda do LW é a unica no estado de Goias a ter vista para o mar."]))
